package com.example.Base64;

import java.util.Base64;


import org.springframework.stereotype.Service;

@Service
public class TestWorkflow {

    public String getDecodeBase64(String funnyStr) {

        byte decode[] = Base64.getDecoder().decode(funnyStr);
        String decodedString = new String(decode);

        try {
            if (decodedString == decodedString.toUpperCase()) {
                String decordlower = decodedString.toLowerCase();

                int spaceCount = 0;
                StringBuilder resultSb = new StringBuilder();
                for (int i = 0; i < decordlower.length(); i++) {
                    if (Character.isWhitespace(decordlower.charAt(i))) {
                        spaceCount++;
                        resultSb.append(String.valueOf(spaceCount));
                        continue;
                    }
                    resultSb.append(decordlower.charAt(i));
                }

                byte[] encodedAsBytes = resultSb.toString().getBytes();
                String BasicBase64format = Base64.getEncoder().encodeToString(encodedAsBytes);

                return BasicBase64format;

            } else {
                throw new Exception();
            }

        } catch (Exception e) {

        }

        return null;

    }


}

