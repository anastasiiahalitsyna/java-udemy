package com.anastasiia.strings;

public class CalculatingTermFrequencyInADocument {
    public static void main(String[] args) {
        String doc = "Every time there is a new COVID wave, a few medicines become popular. " +
                "The desperation to save family members or avoid severe forms of the infection makes" +
                " hapless people opt for the ‘promising’ drugs. Currently, people are made aware of one s" +
                "uch drug called ‘Monoclonal Antibodies Cocktail’, which costs around ₹60,000." +
                " However, several doctors from Telangana have underscored that the antibodies cocktail, " +
                "available in India, are not effective against the Omicron variant. " +
                "They have also stressed that 93% to 95% of the current COVID cases are of Omicron variant." +
                " Even if it is Delta variant, the drug cocktail has to be given within seven days of " +
                "onset of the infection, and it is ineffective if the patient is in a severe stage of" +
                " infection. Doctors said Remdesivir is suggested for patients with Omicron, after " +
                "examining infection severity, presence of co-morbidities, immunity levels, and other " +
                "factors.";
        String term = "infection";
        System.out.println(termFrequency(term, doc));
    }

    // recursion
    public static int getFrequencyCount(String term, String doc) {
        String termLowerCase = term.toLowerCase();
        String docLowerCase = doc.toLowerCase();

        int frequencyCount = 0;

        int index = docLowerCase.indexOf(termLowerCase);

        if (index >= 0) {
            frequencyCount++;
        } else {
            return frequencyCount;
        }

        return frequencyCount + getFrequencyCount(term, doc.substring(index + term.length()));
    }

    public static double termFrequency(String term, String doc) {
        int frequencyCount = getFrequencyCount(term, doc);
        int totalTermCount = term.split(" ").length;
        return (double) frequencyCount / totalTermCount;
    }
}
