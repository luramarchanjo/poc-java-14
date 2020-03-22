package com.example;

public class TextBlocks {

  public static void main(String[] args) {
    String oldWay = "<html>\n" +
        "    <body>\n" +
        "        <p>Hello, world</p>\n" +
        "    </body>\n" +
        "</html>\n";

    String newWay = """
        <html>
            <body>
                <p>Hello, world</p>
            </body>
        </html>
        """;

    System.out.println(oldWay);
    System.out.println(newWay);
  }

}
