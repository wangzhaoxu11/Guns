package com.stylefeng.guns.core.log.factory;

import com.stylefeng.guns.core.common.constant.state.LogSucceed;
import com.stylefeng.guns.core.common.constant.state.LogType;
import com.stylefeng.guns.modular.system.model.SysLoginLog;
import com.stylefeng.guns.modular.system.model.SysOperationLog;

import java.util.Date;

/**
 * 日志对象创建工厂
 *
 * @author fengshuonan
 * @date 2016年12月6日 下午9:18:27
 */
public class LogFactory {

    /**
     * 创建操作日志
     */
    public static SysOperationLog createOperationLog(LogType logType, Integer userId, String bussinessName, String clazzName, String methodName, String msg, LogSucceed succeed) {
        SysOperationLog operationLog = new SysOperationLog();
        operationLog.setLogtype(logType.getMessage());
        operationLog.setLogname(bussinessName);
        operationLog.setUserid(userId);
        operationLog.setClassname(clazzName);
        operationLog.setMethod(methodName);
        operationLog.setCreatetime(new Date());
        operationLog.setSucceed(succeed.getMessage());
        operationLog.setMessage(msg);
        return operationLog;
    }

    /**
     * 创建登录日志
     */
    public static SysLoginLog createLoginLog(LogType logType, Integer userId, String msg, String ip) {
        SysLoginLog loginLog = new SysLoginLog();
        loginLog.setLogname(logType.getMessage());
        loginLog.setUserid(userId);
        loginLog.setCreatetime(new Date());
        loginLog.setSucceed(LogSucceed.SUCCESS.getMessage());
        loginLog.setIp(ip);
        loginLog.setMessage(msg);
        return loginLog;
    }
}
