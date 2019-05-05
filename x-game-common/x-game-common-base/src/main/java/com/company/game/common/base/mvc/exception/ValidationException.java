package com.company.game.common.base.mvc.exception;

/**
 * @description: 验证错误
 */
public class ValidationException extends RuntimeException {


    public ValidationException() {
        super();
    }


    public ValidationException(String message) {
        super(message);
    }
}
