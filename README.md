**Process Overview:**

1.**Reverse Engineering the APK:**
I started by performing reverse engineering on the APK file of the game. To do this, I used the website javadecompilers.com/apk to decompile the APK. 
Once the decompiled ZIP file was downloaded, I also used WinRAR to open and extract its contents, which allowed me to explore the internal files.

**2.Analyzing Files:**
I inspected the extracted files, the activity files, and the layout XML files, images (drawable), and other resources that were required to properly run the app. 
I also checked the AndroidManifest.xml to note any permissions used and which activities were defined as launchable.

**3.Rebuilding in Android Studio:**
Based on the resources and code identified in the previous step, I created a new Android Studio project, into which I copied the necessary Java activity files, layout resources, drawables, and manifest configurations.
This allowed me to recreate the application in a clean development environment.

**4.Understanding the Game Logic:**
I reviewed the game’s logic to understand how it starts and operates.
Once I had a basic understanding of how the gameplay flow works and what is the wanted output, I launched the app and gave it a try.

**5.Debugging & Fixing a Bug:**
During the first try, I encountered a bug related to retrieving data from a URL. 
After investigating the code, I discovered that an unexpected/hidden string had been appended to the URL, preventing it from functioning properly.
I corrected the URL formatting, which resolved the issue, and the app began running correctly.

**6.Playing the Game:**
I played the game using my ID number: 316376748, and the result I got was:
"Survived in Illinois"

![image](https://github.com/user-attachments/assets/b21cf628-398f-4cd7-8bf6-b5346785e7b6)
