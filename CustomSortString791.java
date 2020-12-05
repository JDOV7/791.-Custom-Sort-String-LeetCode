package leetcode;

public class CustomSortString791 {

    public void CustomSortString791() {
        String S = "abc";
        String T = "baaaaca";
        StringBuffer sResult = new StringBuffer();
        StringBuffer sNewT = new StringBuffer(T);
        for (int i = 0; i < S.length(); i++) {
            StringBuffer sTemp = new StringBuffer();
            sTemp.append(S.charAt(i));
            if (sNewT.indexOf(sTemp.toString()) != -1) {
                sResult.append(searchAndRemove(sTemp, sNewT));
            }
        }
        sResult.append(sNewT);
        System.out.println(sResult);
    }

    public String searchAndRemove(StringBuffer sCharacter, StringBuffer sValue) {
        StringBuffer sReturn = new StringBuffer();
        for (int i = 0; i < sValue.length(); i++) {
            if (sValue.indexOf(sCharacter.toString()) != -1) {
                sReturn.append(sCharacter.toString());
                sValue.deleteCharAt(sValue.indexOf(sCharacter.toString()));
                i = i - 1;
            } else {
                break;
            }
        }
        return sReturn.toString();
    }
}
