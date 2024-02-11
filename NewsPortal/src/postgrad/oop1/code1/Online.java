// Author: A00291769
// Date: 30/10/21
// Code 1 Exam

package postgrad.oop1.code1;

abstract public class Online implements NewsMedia
{
    private String theName;

    public Online(String name)
    {
        theName = name;
    }

    @Override
    public String getName()
    {
        return theName;
    }

    @Override
    public String toString()
    {
        return "Name is " + getName();
    }
}

class SubscriptionService extends Online implements QualityJournalism
{
    private String theEditor;

    SubscriptionService(String name, String editor)
    {
        super(name);
        theEditor = editor;
    }

    @Override
    public String getEditor()
    {
        return theEditor;
    }

    @Override
    public String toString()
    {
        return super.toString() + " whose editor is " + getEditor();
    }
}

class Blog extends Online
{
    private String theEditor;

    Blog(String name, String editor)
    {
        super(name);
        theEditor = editor;
    }

    @Override
    public String getEditor()
    {
        return theEditor;
    }

    @Override
    public String toString()
    {
        return super.toString() + " whose editor is " + getEditor();
    }
}
