# PDDP Green Button Test Build

This branch contains a test build of the PDDP Android application.

## Files
- PDDP_green_signed.apk: signed APK for device testing.
- PDDP_final_edit/: modified Apktool-decompiled project.

## Intended changes
- Remove the Settings button.
- Set the Enter System destination to https://sokoaerial.com.
- Change the normal FilledButton background to teal-green #00BFA5.

Note: The background-colour patch affects the shared Flutter default
for filled buttons, so other buttons using that default may also change.

The APK signature was verified using v1, v2 and v3. The latest build
still needs device testing. Firebase/Firestore data collection remains
unfinished.
