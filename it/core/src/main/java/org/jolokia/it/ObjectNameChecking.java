package org.jolokia.it;

/*
 *  Copyright 2009-2010 Roland Huss
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */


/**
 * We need to use MBeanRegisration because Websphere wont let us set our name
 * directly while registering (it always add some boilerplate to the name). Using this
 * way, it works (so the names under which we register correspond to those in the
 * integration test).
 *
 * @author roland
 * @since Jun 25, 2009
 */
public class ObjectNameChecking implements ObjectNameCheckingMBean {
    public String getOk() {
        return "OK";
    }
}