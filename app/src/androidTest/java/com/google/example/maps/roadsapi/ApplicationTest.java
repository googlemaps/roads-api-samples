/*
 * Copyright 2015 Google Inc. All rights reserved.
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF
 * ANY KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.google.example.maps.roadsapi;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.view.View;

/**
 * Sample tests.
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public ApplicationTest() {
        super(MainActivity.class);
    }

    @UiThreadTest
    public void testSampleFlow() throws Exception {
        MainActivity activity = getActivity();

        // Click "Load GPX data" button
        View gpxButton = activity.findViewById(R.id.load_gpx_data);
        activity.onGpxButtonClick(gpxButton);
        assertTrue(activity.mCapturedLocations.size() > 0);

        // Click "Send Snap to Roads requests" button
        View snapButton = activity.findViewById(R.id.snap_to_roads);
        activity.onSnapToRoadsButtonClick(snapButton);
        activity.mSnappedPoints = activity.mTaskSnapToRoads.get();
        assertTrue(activity.mSnappedPoints.size() > 0);

        // Click "Request speed limits" button
        View speedsButton = activity.findViewById(R.id.speed_limits);
        activity.onSpeedLimitButtonClick(speedsButton);
        activity.mPlaceSpeeds = activity.mTaskSpeedLimits.get();
        assertTrue(activity.mPlaceSpeeds.size() > 0);
    }
}