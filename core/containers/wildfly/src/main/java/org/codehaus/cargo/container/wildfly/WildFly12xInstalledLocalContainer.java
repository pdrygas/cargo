/*
 * ========================================================================
 *
 * Codehaus CARGO, copyright 2004-2011 Vincent Massol, 2012-2018 Ali Tokmen.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ========================================================================
 */
package org.codehaus.cargo.container.wildfly;


import org.codehaus.cargo.container.configuration.LocalConfiguration;

/**
 * WildFly 12.x series container implementation.
 */
public class WildFly12xInstalledLocalContainer extends WildFly11xInstalledLocalContainer
{
    /**
     * WildFly 12.x series unique id.
     */
    public static final String ID = "wildfly12x";

    /**
     * {@inheritDoc}
     * @see WildFly11xInstalledLocalContainer#WildFly11xInstalledLocalContainer(LocalConfiguration)
     */
    public WildFly12xInstalledLocalContainer(LocalConfiguration configuration)
    {
        super(configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId()
    {
        return ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName()
    {
        return "WildFly " + getVersion("12.x");
    }
}