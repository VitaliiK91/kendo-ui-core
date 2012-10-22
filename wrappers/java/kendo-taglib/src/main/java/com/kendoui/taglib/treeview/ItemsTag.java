
package com.kendoui.taglib.treeview;

import com.kendoui.taglib.BaseTag;

import com.kendoui.taglib.TreeViewTag;


import java.util.ArrayList;
import java.util.Map;
import java.util.List;

import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class ItemsTag extends BaseTag /* interfaces *//* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag

        TreeViewTag parent = (TreeViewTag)findParentWithClass(TreeViewTag.class);

        parent.setItems(this);

//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize

        items = new ArrayList<Map<String, Object>>();

//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy

        items = null;

//<< destroy

        super.destroy();
    }

//>> Attributes

    private List<Map<String, Object>> items;

    public List<Map<String, Object>> items() {
        return items;
    }

    public static String tagName() {
        return "treeView-items";
    }

    public void addItem(ItemTag value) {
        items.add(value.properties());
    }

//<< Attributes

}
