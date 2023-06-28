package org.apache.cxf.ext.logging;

import org.apache.cxf.message.Message;

import java.util.Map;
import java.util.Set;

public interface MaskSensitiveHelper {

    String maskSensitiveElements(
            Message message,
            String originalLogString);

    void maskHeaders(
            Map<String, String> headerMap,
            Set<String> sensitiveHeaderNames);
}
