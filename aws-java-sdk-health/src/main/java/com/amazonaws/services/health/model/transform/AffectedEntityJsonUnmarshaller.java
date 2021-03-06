/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.health.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.health.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AffectedEntity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AffectedEntityJsonUnmarshaller implements Unmarshaller<AffectedEntity, JsonUnmarshallerContext> {

    public AffectedEntity unmarshall(JsonUnmarshallerContext context) throws Exception {
        AffectedEntity affectedEntity = new AffectedEntity();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("entityArn", targetDepth)) {
                    context.nextToken();
                    affectedEntity.setEntityArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventArn", targetDepth)) {
                    context.nextToken();
                    affectedEntity.setEventArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entityValue", targetDepth)) {
                    context.nextToken();
                    affectedEntity.setEntityValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsAccountId", targetDepth)) {
                    context.nextToken();
                    affectedEntity.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    affectedEntity.setLastUpdatedTime(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("statusCode", targetDepth)) {
                    context.nextToken();
                    affectedEntity.setStatusCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    affectedEntity.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return affectedEntity;
    }

    private static AffectedEntityJsonUnmarshaller instance;

    public static AffectedEntityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AffectedEntityJsonUnmarshaller();
        return instance;
    }
}
