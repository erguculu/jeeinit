//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.mycommercex.exception;

public class UnknownProductException extends RuntimeException {
    private static final long serialVersionUID = -5034522564194578372L;

    public UnknownProductException(Long id) {
        super("The product with id=" + id + " doesn't exist.");
    }
}