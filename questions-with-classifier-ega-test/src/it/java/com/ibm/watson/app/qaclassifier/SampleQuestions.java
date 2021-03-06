/*
 * Copyright IBM Corp. 2015
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.watson.app.qaclassifier;

public class SampleQuestions {
    /**
     * This question will return an answer with confidenceCategory=HIGH
     */
    public static final String HIGH_CONFIDENCE = "What is the NL Classifier?";

    /**
     * This question will return an answer with confidenceCategory=LOW
     */
    public static final String LOW_CONFIDENCE = "How does the classifier improve";

    /**
     * This question will return an empty answer list
     */
    public static final String NO_ANSWERS = "no";
}
