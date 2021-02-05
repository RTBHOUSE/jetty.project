//
// ========================================================================
// Copyright (c) 1995-2021 Mort Bay Consulting Pty Ltd and others.
//
// This program and the accompanying materials are made available under the
// terms of the Eclipse Public License v. 2.0 which is available at
// https://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
// which is available at https://www.apache.org/licenses/LICENSE-2.0.
//
// SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
// ========================================================================
//

import javax.servlet.ServletContainerInitializer;

import org.eclipse.jetty.annotations.AnnotationConfiguration;
import org.eclipse.jetty.webapp.Configuration;

module org.eclipse.jetty.annotations
{
    exports org.eclipse.jetty.annotations;

    requires java.annotation;
    requires java.naming;
    requires transitive org.eclipse.jetty.plus;
    requires transitive org.objectweb.asm;
    requires org.slf4j;
    requires org.eclipse.jetty.servlet;
    requires org.eclipse.jetty.webapp;

    uses ServletContainerInitializer;

    provides Configuration with AnnotationConfiguration;
}
