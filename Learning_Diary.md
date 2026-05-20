
Lappeenrannan teknillinen yliopisto
School of Business and Management


Sofware Development Skills

Student name: Jamshed Rashid
Student number: 002382632

# LEARNING DIARY, ANDROID MOBILE DEVELOPMENT MODULE

---

# LEARNING DIARY

## 18.5.2026

I began the module of mobile development on Android by going through the course overview and project specifications. It was clear that the objective of this module was to learn the basics of Android Studio and to develop an Android application.

It became clear that I would have to finish the tutorial tasks, keep a learning journal, develop a personal project, make a README file, and provide a link to the video with the functioning app. Another thing I discovered was that I had to keep everything in a public GitHub repository.

Android Studio was installed and an Android app was created in it. Java was chosen because I was new to Android programming, and I thought that this would be more comfortable for me. Also I have created a GitHub repository and committed my project with the help of Git.

At first, there were difficulties in committing my project to GitHub since it does not support regular password authentication via a terminal. To solve the problem, I used personal access tokens.

By then, i had figured out the process of taking the class: watch the video tutorials, apply what I learned in my application, save everything on GitHub, and reflect on my experience in my learning journal.


## 18.5.2026

The name of the video I watched is “Introduction Part 1.” The video contains information about how to create an Android Studio project, and in addition to that, how to use Android Studio to develop an application.

After learning this i applied it to my own project, Student Task Manager. I edited `activity_main.xml` to design the screen and `MainActivity.java` to write the app logic.

I added beginner Android components such as:

- EditText
- Button
- TextView

The first version of my app allowed the user to type a study task, press a button, and show the task on the screen.

From this part, I learned that XML files are used for the app layout and Java files are used for the app behavior. I also learned how to connect XML components to Java using `findViewById`.

I committed this first working version to GitHub with the message:

`Add Part 1 basic task input app`

---

## 19.5.2026

I moved on to the second tutorial video which was titled Core Elements Part 2. In this tutorial, Android core elements like Activities and Intents were explained.

Having understood the concept, I used it in my own application by making a second screen where you could add your tasks. I came to know that an Activity is a single screen in an Android application. An Intent is used to switch between Activities and share data.

I added an Add Task screen where the user can enter:

- Task name
- Subject or course name
- Important task option using CheckBox

Opening the Add Task screen from the main screen happens by using the Intent. The data regarding the added task is then returned back to the main screen after it has been saved.

While trying to create the second Activity, I faced a minor challenge since I had initially named it differently. However, I was able to solve it and proceed with my work.

This step showed me how Android apps can have multiple views instead of only one screen.

I committed this progress with the message:

`Add basic app setup with task input and activity navigation`

---

## 19.5.2026

I went through the third video tutorial named Lists, Layouts, and Images Part 3. In this video, I learned about ListView, custom layouts, and ImageView.

With this knowledge i made some improvements to my Student Task Manager application. Earlier, my application could display only one task result at a time. With the help of ListView, I was able to display multiple tasks.

I also created a custom row layout called `task_row.xml`. Each row in the list shows:

- Task icon
- Task title
- Subject
- Status

ImageView was utilized to add icons to tasks. Important tasks have a different icon, allowing the user to interpret them better.

Another element that I included in my application was the Details screen. It was triggered when the user clicks on a task in ListView, opening a new screen with detailed information about the task. This also gave me an opportunity to work with Activities and Intents once again.

The reason why this element was crucial is that according to the course project requirements, one must have a component displaying information, such as ListView.

I committed this progress with the message:

`Add task list with custom layout and image view`

---

## 20.5.2026

I improved the app and made it more complete as my final project.

I added validation so the user cannot save an empty task name. I also added a default subject called “General” if the user does not enter a subject. This made the app more stable and user-friendly.

I added sample tasks so the ListView is not empty when the app starts. This also makes the app look better when showing it in the final video.

At this stage, my app included the main requirements from the course:

- Functionality with components
- Multiple views
- A component to display information
- Custom layout
- ImageView
- Personal student task manager logic

I committed this update with the message:

`Improve app with validation and sample tasks`

---

## 20.5.2026

I have written the README for my GitHub repository. The README file is very easy to understand and use. The README explains what my app does, what technologies I used, what topics from the course I used, and how to run my app.

I have also written this learning diary based on the course template. My learning diary is written in a dated manner, so you can see my progress from the initial setup to the final project.

The name of my final project is Student Task Manager. The project was created by gradually implementing the concepts from the tutorial parts:

In the first part, I learned how to setup Android Studio and create simple UI components. These concepts were implemented in order to create the first version of my app.

In the second part, I learned about Activities and Intents. These concepts were used in order to add several screens to the app.

In the third part, I learned about ListView, custom layout, and ImageView. These concepts were used in order to implement task list, custom task row, icons, and details screen.
.

In general, this course made me familiar with the fundamental aspects of developing applications using Android. The initial problem that I had was understanding Android Studio because there are a lot of folders and files. However, after completing my project, I gained insight into the distinction between XML layout files, Java activity files, and project configuration files.

Moreover, I realized how GitHub reflects the progress of development using commits. Initially, my application consisted only of a task input feature; however, it evolved to a Student Task Manager.
