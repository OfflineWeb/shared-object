/*
 * The MIT License
 *
 *   Copyright 2017 papa.
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 *
 */

package offlineweb.common.sharedobject.po;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author papa
 *         created on 7/30/17.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class CouchPO implements Serializable {
    @JsonProperty("_id")
    private String _id;

    @JsonProperty("_rev")
    private String _rev;

    @JsonProperty("_attachments")
    private Map<String, Attachment> _attachments;

    @JsonProperty("_id")
    public String getId() {
        return _id;
    }

    @JsonProperty("_id")
    public void setId(String _id) {
        this._id = _id;
    }

    @JsonProperty("_rev")
    public String getRev() {
        return _rev;
    }

    @JsonProperty("_rev")
    public void setRev(String _rev) {
        this._rev = _rev;
    }

    @JsonProperty("_attachments")
    public Map<String, Attachment> getAttachments() {
        return _attachments;
    }

    @JsonProperty("_attachments")
    public void setAttachments(Map<String, Attachment> attachments) {
        this._attachments = attachments;
    }

    public void addAttachment(String name, Attachment attachment) {
        if (this._attachments == null) {
            this._attachments = new LinkedHashMap<String, Attachment>();
        }
        this._attachments.put(name, attachment);
    }
}
