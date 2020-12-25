/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		// New Google query
    GoogleSearch gS = new GoogleSearch(keywords);
// Get the number of websites the user wants to analyze per Google query
    int accuracy = Config.SEARCH_ACCURACY;
// Research on all the first [accuracy] pages
    for (int j = 0; j < accuracy; j++) {
// Get the URL of the GoogleResult
        globalURL = gS.get(j).getUrl();
// Connection to the website
        Document wDoc = Jsoup.connect(globalURL).timeout(10000).
        ignoreHttpErrors(true).
        ignoreContentType(true).
        referrer(REFERRER).
        userAgent(USER_AGENT).get();
// Get the code, parse the page to get the <BODY> part
        Elements bodyPage = wDoc.select(GLOBAL_TEXT);
// Clean the code
        String htmlCode = StringEscapeUtils.unescapeHtml4((bodyPage.get(0).toString());
        if(!htmlCode.isEmpty()){
// Let's split the text of the page in different sentences
        StringTokenizer sToken = new StringTokenizer(htmlCode, Config.SENTENCES_SEPARATORS);
// For each string (they are mostly sentences), check the variation
        rate between the string we're analyzing and the string concerned
        while (sToken.hasMoreElements()) {
            String globalSentence = sToken.nextToken().trim();
            int levenPercentage = Config.LEVENSHTEIN_PERCENTAGE ;
            int dist =LevenshteinDistance.getVariationRate(this.keywords, globalSentence);
 // If they are similar, return true and add the sentence to the list ofplagiarized sentences
            if(dist > levenPercentage){
                setSimilarSentence(globalSentence);
                return true;
                }
            }
        }
}

}
