package com.chenhl.template.common.result;

public class ActionResult<T> {

    public static final ActionResult Success = new ActionResult(true,
            "op_success");
    public static final ActionResult NoPrivilege = new ActionResult(false,
            "op_no_privilege"); // 无权限
    public static final ActionResult OpException = new ActionResult(false,
            "op_exception"); // 操作异常
    public static final ActionResult ErrorStateAction = new ActionResult(false,
            "op_error_state_action"); // 当前状态不能执行此操作。
    public static final ActionResult CannotFindBizObj = new ActionResult(false,
            "cannot_find_biz_obj"); // 不能找到对象。
    public static final ActionResult CannotFindAction = new ActionResult(false, "cannot_find_action"); //不能找到当前Action。

    /**
     * 操作编码
     */
    private String operateCode;

    /**
     * 返回值
     */
    private T retValue;

    /**
     * 操作是否成功
     */
    private boolean isSuccess;

    /**
     * 操作消息
     */
    private String message;

    /**
     * 错误消息，比如说异常
     */
    private String error;

    /**
     * @param isSuccess
     *            初始化是否成功
     */
    public ActionResult(String operateCode, T retValue, boolean isSuccess, String message, String error) {
        this.operateCode = operateCode;
        this.retValue = retValue;
        this.isSuccess = isSuccess;
        this.message = message;
        this.error = error;
    }

    /**
     * @param isSuccess
     *            初始化是否成功
     * @param message
     *            初始化消息
     */
    public ActionResult(boolean isSuccess, String message) {
        this.isSuccess = isSuccess;
        this.message = message;
    }



    /**
     * 构造返回数据信息方法
     * @param isSuccess
     * @param retValue
     */
    public ActionResult(T retValue, boolean isSuccess) {
        this.retValue = retValue;
        this.isSuccess = isSuccess;
    }


    public String getOperateCode() {
        return operateCode;
    }

    public Object getRetValue() {
        return retValue;
    }

    public String getMessage() {
        return message;
    }

    public boolean getIsSuccess() {
        return isSuccess;
    }

    public String getError() {
        return error;
    }

    public void setRetValue(T retValue) {
        this.retValue = retValue;
    }
}
