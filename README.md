# ActivityLifecycle

Problem:

Implement an Android application that displays Logs in Logcat when the following methods are called:

onCreate() - handles the creation of the activity object, and the loading of any static resources like themes, images, layouts, set up menus, and the like.

onStart() - executes every time the activity begins.

onResume() - executes when the activity is making a transition from the Paused state and into the Running state again.

onPause() - called when the activity is still partially visible.

onSaveInstanceState() - called before the activity gets destroyed, which means you get an opportunity to save any variables you want to retain.

onStop() - called when the activity is no longer visible on the screen.

onRestart() - called when activity was stopped but is started again later.

onDestroy() - called when the entire app is being shut down and unloaded from memory.
