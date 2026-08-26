package org.jboss.as.controller.client.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:10+0200")
public class ControllerClientLogger_$logger_zh_CN extends ControllerClientLogger_$logger_zh implements ControllerClientLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ControllerClientLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String maxDisplayUnitLength$str() {
        return "WFLYCC0017: 屏幕使用面积很贵，displayUnit 必须在 5 个字符以下。";
    }
    @Override
    protected String noFailureDetails$str() {
        return "WFLYCC0019: 没有提供失败详情";
    }
    @Override
    protected String leakedControllerClient$str() {
        return "WFLYCC0034: 关闭泄漏的控制器客户";
    }
    @Override
    protected String cannotDeriveDeploymentName$str() {
        return "WFLYCC0004: 无法使用 %1$s 衍生出部署名称 -- 使用可采用 'name' 参数的超载方法变体";
    }
    @Override
    protected String failed$str() {
        return "WFLYCC0008: 失败的";
    }
    @Override
    protected String notConfigured$str() {
        return "WFLYCC0020: 没有配置任何 %1$s";
    }
    @Override
    protected String rollbackRolledBack$str() {
        return "WFLYCC0026: Rollback 是其自身的退回";
    }
    @Override
    protected String globalRollbackNotCompatible$str() {
        return "WFLYCC0009: 全局退回与服务器重启不兼容";
    }
    @Override
    protected String controllerClientNotClosed$str() {
        return "WFLYCC0030: 分配栈跟踪信息：";
    }
    @Override
    protected String cannotAddDeploymentAction$str() {
        return "WFLYCC0001: 开始生成转出计划后无法添加部署动作";
    }
    @Override
    protected String invalidAddressType$str() {
        return "WFLYCC0033: 地址类型必须未 ModelType.LIST。";
    }
    @Override
    protected String invalidUri$str() {
        return "WFLYCC0014: %1$s 不是有效 URI";
    }
    @Override
    protected String invalidValue3$str() {
        return "WFLYCC0015: 非法 %1$s 值 %2$d -- 必须大于 %3$d";
    }
    @Override
    protected String streamWasClosed$str() {
        return "WFLYCC0036: 流已被关闭";
    }
    @Override
    protected String noFailureDescription$str() {
        return "WFLYCC0031: 因为操作成功，所以没有关于失败的描述。";
    }
    @Override
    protected String failedToParseAuthenticationConfig$str() {
        return "WFLYCC0037: 未能解析配置文件：%1$s";
    }
    @Override
    protected String invalidActionType$str() {
        return "WFLYCC0012: 无效动作类型：%1$s";
    }
    @Override
    protected String serverDeploymentAlreadyExists$str() {
        return "WFLYCC0028: 该服务器中已经有名为 %1$s 的部署";
    }
    @Override
    protected String objectIsClosed$str() {
        return "WFLYCC0022: %1$s 关闭";
    }
    @Override
    protected String cannotConvert$str() {
        return "WFLYCC0003: 无法将 %1$s 转换为 %2$s";
    }
    @Override
    protected String cannotUseDeploymentPlan$str() {
        return "WFLYCC0005: 无法使用不是由这个管理器生成的 DeploymentPlan";
    }
    @Override
    protected String operationsNotAllowed$str() {
        return "WFLYCC0024: 内容和部署修改后不允许 %1$s 操作";
    }
    @Override
    protected String cannotAddDeploymentActionsAfterStart$str() {
        return "WFLYCC0002: 开始生成转出计划后无法添加部署动作";
    }
    @Override
    protected String unknownActionType$str() {
        return "WFLYCC0029: 未知动作类型 %1$s";
    }
    @Override
    protected String operationNameNotFound$str() {
        return "WFLYCC0032: 没有定义操作的名称。";
    }
    @Override
    protected String domainDeploymentAlreadyExists$str() {
        return "WFLYCC0007: 该域中已存在名为 %1$s 的部署";
    }
    @Override
    protected String operationOutcome$str() {
        return "WFLYCC0023: 操作输出结果为 %1$s";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYCC0035: 无法删除临时文件 %1$s，将在退出时删除";
    }
    @Override
    protected String gracefulShutdownAlreadyConfigured$str() {
        return "WFLYCC0010: 已使用超时 %1$d 毫秒配置关闭";
    }
    @Override
    protected String invalidPrecedingAction$str() {
        return "WFLYCC0013: 前面的动作不是 %1$s";
    }
    @Override
    protected String invalidValue4$str() {
        return "WFLYCC0016: 非法 %1$s 值 %2$d -- 必须大于 %3$d 且小于 %4$d";
    }
    @Override
    protected String rollbackTimedOut$str() {
        return "WFLYCC0027: Rollback 超时";
    }
    @Override
    protected String incompleteDeploymentReplace$str() {
        return "WFLYCC0011: 域中只能有一个使用给定唯一名称的部署版本。该部署计划指定使用部署 %1$s 的新版本替换现有部署版本，并使用同一唯一名称，但不要求替换所有服务器组。缺少的服务器组为：%2$s";
    }
    @Override
    protected String rollbackCancelled$str() {
        return "WFLYCC0025: 取消 Rollback";
    }
}
