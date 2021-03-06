/*
 * Copyright 2015 DuraSpace, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fcrepo.kernel.modeshape.services;

import javax.jcr.Credentials;
import javax.servlet.http.HttpServletRequest;

import org.fcrepo.kernel.api.services.CredentialsService;
import org.modeshape.jcr.api.ServletCredentials;
import org.springframework.stereotype.Component;

/**
 * @author acoburn
 * @since Jun 2, 2016
 */
@Component
public class CredentialsServiceImpl implements CredentialsService {

    @Override
    public Credentials getCredentials(final HttpServletRequest request) {
        return new ServletCredentials(request);
    }
}
