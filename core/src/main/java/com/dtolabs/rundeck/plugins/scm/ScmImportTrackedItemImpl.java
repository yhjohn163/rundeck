package com.dtolabs.rundeck.plugins.scm;

/**
 * Created by greg on 9/10/15.
 */
public class ScmImportTrackedItemImpl implements ScmImportTrackedItem {
    private String id;
    private String title;
    private String iconName;

    public ScmImportTrackedItemImpl(final String id, final String title, final String iconName) {
        this.id = id;
        this.title = title;
        this.iconName = iconName;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
}