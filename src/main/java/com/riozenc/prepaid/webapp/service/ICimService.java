package com.riozenc.prepaid.webapp.service;

import java.util.HashMap;
import java.util.List;

public interface ICimService {
    public HashMap<String, Object> meterReadingInit(List<Long> ids);
}
