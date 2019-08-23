package com.example.appteste;

import android.content.Context;

import androidx.test.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withInputType;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.appteste", appContext.getPackageName());
    }

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void calculoImcTela(){
        onView(withId(R.id.peso)).perform(typeText("80"));
        onView(withId(R.id.altura)).perform(typeText("2"));
        closeSoftKeyboard();
        onView(withId(R.id.calcular)).perform(click());


        onView(withText("o resultado e: 20.0")).check(matches(isDisplayed()));


    }

}
