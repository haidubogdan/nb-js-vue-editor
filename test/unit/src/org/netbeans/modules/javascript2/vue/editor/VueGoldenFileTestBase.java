/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.javascript2.vue.editor;

import java.io.File;
import org.netbeans.junit.NbTestCase;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 *
 * @author bogdan.haidu
 */
public abstract class VueGoldenFileTestBase extends VueTestBase {

    public VueGoldenFileTestBase(String testName) {
        super(testName);
    }

    protected abstract String getTestResult(String filename) throws Exception;

    protected void performTest(String filename) throws Exception {
        // parse the file
        String result = getTestResult(filename);
        String fullClassName = this.getClass().getName();
        String goldenFileDir = fullClassName.replace('.', '/');
        // try to find golden file
        String goldenFolder = getDataSourceDir().getAbsolutePath() + "/goldenfiles/" + goldenFileDir + "/";
        File goldenFile = new File(goldenFolder + filename + ".pass");
        if (!goldenFile.exists()) {
            // if doesn't exist, create it
            FileObject goldenFO = touch(goldenFolder, filename + ".pass");
            copyStringToFileObject(goldenFO, result);
        } else {
            // if exist, compare it.
            FileObject resultFO = touch(getWorkDir(), filename + ".result");
            copyStringToFileObject(resultFO, result);
            assertFile(FileUtil.toFile(resultFO), goldenFile, getWorkDir());
        }
    }
}
