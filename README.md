# Overview

The Java 14 was release at 03/2020 and the main features are:

#### [Accounting Currency Format Support](https://bugs.openjdk.java.net/browse/JDK-8215181)

"Currency format instances with accounting style, in which the amount is formatted in parentheses in 
some locales, can be obtained by calling NumberFormat.getCurrencyInstance(Locale) with the 
"u-cf-account" Unicode locale extension. For example in Locale.US, it will format to "($3.27)" 
instead of "-$3.27". Refer to CLDR's accounting currency format style for additional information."

#### [Records (Preview)](https://bugs.openjdk.java.net/browse/JDK-8222777)

In JDK 14, the Records (JEP 359) preview feature adds a new class java.lang.Record. The java.lang 
package is implicitly imported on demand, that is, import java.lang.*. If code in an existing 
source file imports some other package on demand, for example, import com.myapp.*;, and that other 
package declares a type called Record, then code in the existing source file which refers to that 
type will not compile without change. To make the code compile, import the other package's Record 
type using a single-type import, for example, import com.myapp.Record;.

##### Compiling and running

To compile you need to enable the preview feature, to do that, execute the command bellow:

`javac --enable-preview --release 14 src/main/java/com/example/RecordPerson.java src/main/java/com/example/RecordMain.java`

To test your application use need to run the command bellow:

`java --enable-preview -cp src/main/* com.example.RecordMain`

[Release Notes](https://jdk.java.net/14/release-notes)