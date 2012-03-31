/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.plugins.gae.task.appcfg.backends

/**
 * Google App Engine task rolling back backend on the server.
 *
 * @see <a href="https://developers.google.com/appengine/docs/java/backends/overview?hl=cs#Commands">Documentation</a>
 * @author Benjamin Muschko
 */
class GaeRollbackBackendTask extends AbstractGaeSingleBackendTask {
    static final String COMMAND = 'rollback'

    @Override
    String startLogMessage() {
        "Starting to roll back backend '${getBackend()}'..."
    }

    @Override
    String errorLogMessage() {
        "An error occurred rolling back backend '${getBackend()}'."
    }

    @Override
    String finishLogMessage() {
        "Finished rolling back backend '${getBackend()}'."
    }

    @Override
    String getCommand() {
        COMMAND
    }
}
