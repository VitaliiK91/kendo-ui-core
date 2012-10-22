
package com.kendoui.taglib.autocomplete;

import com.kendoui.taglib.FunctionTag;

import com.kendoui.taglib.AutoCompleteTag;


import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class DataBoundTag extends FunctionTag /* interfaces *//* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag

        AutoCompleteTag parent = (AutoCompleteTag)findParentWithClass(AutoCompleteTag.class);

        parent.setDataBound(this);

//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes

    public static String tagName() {
        return "autoComplete-dataBound";
    }

//<< Attributes

}
