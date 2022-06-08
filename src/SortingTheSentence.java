public class SortingTheSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("KTFkUVVrmYMSo2 wXlQraUqblfhCfDLK3 IfTuftYVualQ6 NhpQ5 HlRjClVtQrTFcwbx4 fi1"));
    }

    public static String sortSentence(String s) {
        String[] sentenceAsArray = s.split(" ");
        swap(sentenceAsArray);
        removeDigits(sentenceAsArray);
        return merge(sentenceAsArray);
    }

    static void swap(String[] sentenceAsArray) {
        int correctIndex = -1;
        for (int j = 0; j < sentenceAsArray.length; j++) {
            for (int i = 0; i < sentenceAsArray.length; i++) {
                correctIndex = getCorrectIndex(sentenceAsArray[i]);
                if (i != correctIndex) {
                    String temp = sentenceAsArray[i];
                    sentenceAsArray[i] = sentenceAsArray[correctIndex];
                    sentenceAsArray[correctIndex] = temp;
                }
            }
        }
    }

    static int getCorrectIndex(String string) {
        return Integer.parseInt(String.valueOf(string.charAt(string.length() - 1))) - 1;
    }

    static void removeDigits(String[] sentenceAsArray) {
        for (int i = 0; i < sentenceAsArray.length; i++) {
            sentenceAsArray[i] =
                    sentenceAsArray[i]
                            .substring(0, sentenceAsArray[i].length() - 1);
        }
    }

    static String merge(String[] sentenceAsArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : sentenceAsArray)
            stringBuilder.append(s).append(" ");
        return stringBuilder.toString().trim();
    }
}
