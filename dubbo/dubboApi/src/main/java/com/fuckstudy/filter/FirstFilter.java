package com.fuckstudy.filter;



import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;



import org.apache.dubbo.rpc.*;

/**
 * @author Dao
 * @date 2021/1/19 9:56
 */
@Activate(group = {CommonConstants.CONSUMER,CommonConstants.PROVIDER},order = 2)
public class FirstFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println(" 来啦，客官" );
        Result result = invoker.invoke(invocation);
        if(result.getException() instanceof RpcException){
            System.out.println("invoker = " + invoker + ", invocation = " + invocation);
            System.out.println(" 出错啦" );
        }
        return result;
    }
}
