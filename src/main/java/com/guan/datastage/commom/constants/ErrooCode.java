
package com.guan.datastage.commom.constants;

/**
 * 异常代码定义
 * 
 * @author guan
 */
public interface ErrooCode
{
    /**
     * 异常值范围:0-1000 系统异常编码定义,0表示正常，非0值表示
     * 
     * @author guan
     */
    interface System
    {
        int CODE_OK = 0;
        String MSG_OK = " OK";

        int CODE_UNKNOWN_ERROR = 1;
        String MSG_UNKNOWN_ERROR = "System unknown error";

        int CODE_PARAMETER_NULL = 2;
        String MSG_PARAMETER_NULL = "parameter of null value";

    }

}
