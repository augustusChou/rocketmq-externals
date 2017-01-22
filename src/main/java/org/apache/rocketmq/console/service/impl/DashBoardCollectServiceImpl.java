/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.rocketmq.console.service.impl;

import org.apache.rocketmq.console.service.DashBoardCollectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

//@Service
public class DashBoardCollectServiceImpl implements DashBoardCollectService {

    private Logger logger = LoggerFactory.getLogger(DashBoardCollectServiceImpl.class);

    @Scheduled(cron = "0/5 * *  * * ? ")
    @Override
    public void collectTopic() {
        logger.error("collect topic >>>>>>");
    }

    @Scheduled(cron = "0/5 * *  * * ? ")
    @Override
    public void collectBroker() {
        logger.error("collect broker >>>>>>");
    }

    @Scheduled(cron = "0/5 * *  * * ? ")
    @Override
    public void saveData() {
        logger.error("save data >>>>>>");
    }
}
