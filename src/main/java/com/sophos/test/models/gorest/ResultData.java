package com.sophos.test.models.gorest;

import java.util.List;

/**
 * This class contains the entire body of the request.
 * @author Andres Villalba
 */
public class ResultData {
    private MetaData _metaData;
    private List<ClientData> result = null;

    public MetaData getMeta() {
        return _metaData;
    }

    public void setMeta(MetaData _metaData) {
        this._metaData = _metaData;
    }

    public List<ClientData> getClientData() {
        return result;
    }

    public void setClientData(List<ClientData> result) {
        this.result = result;
    }
}