# DOB
Developed java program with Graphic User Interface to prompt the user and read in user date of birth in (mm/dd/yyyy) format and show What day of the week they were born? e.g. "You were born on a Friday
and their zodiac sign. Followed Test Driven Development writing junit test cases.

List of test cases are found in TraceabilityMatrix_SoftwareDesign.xlsx
Refer to Design.docx for software design of this application.
Refer to UML.docx for UML diagram.
In this application, user will be prompted with UI to enter Date of Birth in MM/DD/YYYY format and click Process button in UI. Class “ts_frame” implements UI and gives the input user date of birth to Class “ts_ProcessInput”. Also, receives user birth day of week and zodiac sign results returned by ts_ProcessInput.parseInput () function and displays as UI content. 
Class “ts_ProcessInput” checks for valid input entered by user and and creates two instances of classes “ts_DayofWeek” and “ts_ZodiacSign”. Also, receives result returned by ts_DayofWeek.dayOfWeek() and ts_ZodiacSign.zodiacSign(), concatenates prepares a single string returned to “ts_frame”.
Class ts_DayofWeek determines day of week using java default libraries Calendar, Date and SimpleDateFormat. Also, returns the result computed by it’s method ts_DayofWeek.dayOfWeek() to “ts_ProcessInput”.
Class ts_ZodiacSign determines zodiac sign for the given date of birth and returns the result computed by it’s method ts_ZodiacSign.zodiacSign() to “ts_ProcessInput”.
Sample output images are as shown in wednesday.Aquarius.PNG, Tuesday.Pisces.PNG and Tuesday.Capricorn.PNG
