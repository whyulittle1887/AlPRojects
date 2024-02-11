// Author: A00291769
// Date: 30/10/21
// Code 1 Exam

package postgrad.oop1.code1;

abstract public class Print implements NewsMedia
{
    private String theName;

    public Print(String name)
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

class Broadsheet extends Print implements QualityJournalism
{
    private String theEditor;

    Broadsheet(String name, String editor)
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

class Tabloid extends Print
{
    private String theEditor;

    Tabloid(String name, String editor)
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