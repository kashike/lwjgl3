/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl;

/** A runtime exception thrown by LWJGL when it encounters an EGL error. */
public class EGLException extends RuntimeException {

	public EGLException(int errorCode) {
		this(String.format("%s [0x%X]", EGL.getErrorString(errorCode), errorCode));
	}

	public EGLException(String message) {
		super(message);
	}

	public EGLException(String format, Object... args) {
		super(String.format(format, args));
	}

}