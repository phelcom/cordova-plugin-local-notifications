/*
 * Apache 2.0 License
 *
 * Copyright (c) Sebastian Katzer 2017
 *
 * This file contains Original Code and/or Modifications of Original Code
 * as defined in and that are subject to the Apache License
 * Version 2.0 (the 'License'). You may not use this file except in
 * compliance with the License. Please obtain a copy of the License at
 * http://opensource.org/licenses/Apache-2.0/ and read it before using this
 * file.
 *
 * The Original Code and all software distributed under the License are
 * distributed on an 'AS IS' basis, WITHOUT WARRANTY OF ANY KIND, EITHER
 * EXPRESS OR IMPLIED, AND APPLE HEREBY DISCLAIMS ALL SUCH WARRANTIES,
 * INCLUDING WITHOUT LIMITATION, ANY WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, QUIET ENJOYMENT OR NON-INFRINGEMENT.
 * Please see the License for the specific language governing rights and
 * limitations under the License.
 */

package de.appplant.cordova.plugin.localnotification;

import de.appplant.cordova.plugin.notification.Notification;

/**
 * The receiver activity is triggered when a notification is clicked by a user.
 * The activity calls the background callback and brings the launch intent
 * up to foreground.
 */
public class ClickActivity extends de.appplant.cordova.plugin.notification.activity.ClickActivity {

    /**
     * Called when local notification was clicked by the user.
     *
     * @param notification Wrapper around the local notification
     */
    @Override
    public void onClick(Notification notification) {
        LocalNotification.fireEvent("click", notification);

        super.onClick(notification);

        // if (notification.getOptions().isOngoing())
        //     return;

        // String event = notification.isRepeating() ? "clear" : "cancel";
        // LocalNotification.fireEvent(event, notification);
    }

}
