// Author: A00291769
// Date: 30/10/21
// Code 1 Exam

package postgrad.oop1.code1;

import java.util.ArrayList;

public class NewsPortal
{
    public static void main(String[] args)
    {
        ArrayList<NewsMedia> nm = new ArrayList<>();

        NewsMedia t1 = new Tabloid("The Irish Daily Star", "Des Gibson");
        nm.add(t1);

        NewsMedia s1 = new SubscriptionService("The Huffington Post", "Tara Lee");
        nm.add(s1);

        processNewsMedia(nm);
    }

    public static void processNewsMedia(ArrayList<NewsMedia> outlets)
    {
        for (NewsMedia outlet : outlets)
        {
            System.out.print(outlet);

            if (outlet instanceof QualityJournalism)
            {
                System.out.print(" - Quality Journalism");
            }

            System.out.println("");
        }
    }
}
