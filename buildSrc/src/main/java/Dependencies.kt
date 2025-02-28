/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

// Synchronized version numbers for dependencies used by (some) modules
object Versions {
    const val kotlin = "1.3.61"
    const val coroutines = "1.3.2"

    const val junit = "4.12"
    const val robolectric = "4.1"
    const val mockito = "2.24.5"
    const val maven_ant_tasks = "2.1.3"

    const val mockwebserver = "3.10.0"

    const val dokka = "0.9.17"
    const val android_gradle_plugin = "3.4.1"
    const val android_maven_publish_plugin = "3.6.2"
    const val lint = "26.3.2"
    const val detekt = "1.0.1"

    const val sentry = "1.7.21"
    const val okhttp = "3.13.1"
    const val zxing = "3.3.0"
    const val jna = "5.2.0"
    const val disklrucache = "2.0.2"
    const val leakcanary = "1.6.3"

    const val mozilla_appservices = "0.44.0"

    const val mozilla_glean = "21.3.0"

    const val material = "1.0.0"
    const val nearby = "17.0.0"

    object AndroidX {
        const val annotation = "1.1.0"
        const val appcompat = "1.1.0"
        const val browser = "1.2.0-alpha07"
        const val cardview = "1.0.0"
        const val constraintlayout = "1.1.3"
        const val core = "1.1.0"
        const val fragment = "1.1.0"
        const val recyclerview = "1.0.0"
        const val test = "1.2.0"
        const val test_ext = "1.1.1"
        const val espresso = "3.2.0"
        const val room = "2.1.0"
        const val paging = "2.1.0"
        const val palette = "1.0.0"
        const val lifecycle = "2.1.0"
        const val media = "1.1.0"
        const val work = "2.2.0"
        const val arch_core_testing = "2.1.0"
        const val uiautomator = "2.2.0"
        const val localbroadcastmanager = "1.0.0"
    }

    object Firebase {
        const val core = "16.0.1"
        const val messaging = "17.3.4"
    }
}

// Synchronized dependencies used by (some) modules
@Suppress("MaxLineLength")
object Dependencies {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlin_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"

    const val testing_junit = "junit:junit:${Versions.junit}"
    const val testing_robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
    const val testing_robolectric_playservices = "org.robolectric:shadows-playservices:${Versions.robolectric}"
    const val testing_mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val testing_mockwebserver = "com.squareup.okhttp3:mockwebserver:${Versions.mockwebserver}"
    const val testing_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val testing_maven_ant_tasks = "org.apache.maven:maven-ant-tasks:${Versions.maven_ant_tasks}"
    const val testing_leakcanary = "com.squareup.leakcanary:leakcanary-android-instrumentation:${Versions.leakcanary}"

    const val androidx_annotation = "androidx.annotation:annotation:${Versions.AndroidX.annotation}"
    const val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appcompat}"
    const val androidx_arch_core_testing = "androidx.arch.core:core-testing:${Versions.AndroidX.arch_core_testing}"
    const val androidx_browser = "androidx.browser:browser:${Versions.AndroidX.browser}"
    const val androidx_cardview = "androidx.cardview:cardview:${Versions.AndroidX.cardview}"
    const val androidx_constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraintlayout}"
    const val androidx_core = "androidx.core:core:${Versions.AndroidX.core}"
    const val androidx_core_ktx = "androidx.core:core-ktx:${Versions.AndroidX.core}"
    const val androidx_fragment = "androidx.fragment:fragment:${Versions.AndroidX.fragment}"
    const val androidx_lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.AndroidX.lifecycle}"
    const val androidx_lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.AndroidX.lifecycle}"
    const val androidx_media = "androidx.media:media:${Versions.AndroidX.media}"
    const val androidx_paging = "androidx.paging:paging-runtime:${Versions.AndroidX.paging}"
    const val androidx_palette = "androidx.palette:palette-ktx:${Versions.AndroidX.palette}"
    const val androidx_recyclerview = "androidx.recyclerview:recyclerview:${Versions.AndroidX.recyclerview}"
    const val androidx_room_runtime = "androidx.room:room-runtime:${Versions.AndroidX.room}"
    const val androidx_room_compiler = "androidx.room:room-compiler:${Versions.AndroidX.room}"
    const val androidx_room_testing = "androidx.room:room-testing:${Versions.AndroidX.room}"
    const val androidx_test_core = "androidx.test:core-ktx:${Versions.AndroidX.test}"
    const val androidx_test_junit = "androidx.test.ext:junit:${Versions.AndroidX.test_ext}"
    const val androidx_test_runner = "androidx.test:runner:${Versions.AndroidX.test}"
    const val androidx_test_rules = "androidx.test:rules:${Versions.AndroidX.test}"
    const val androidx_test_uiautomator = "androidx.test.uiautomator:uiautomator:${Versions.AndroidX.uiautomator}"
    const val androidx_work_runtime = "androidx.work:work-runtime-ktx:${Versions.AndroidX.work}"
    const val androidx_work_testing = "androidx.work:work-testing:${Versions.AndroidX.work}"
    const val androidx_espresso_core = "androidx.test.espresso:espresso-core:${Versions.AndroidX.espresso}"
    const val androidx_localbroadcastmanager = "androidx.localbroadcastmanager:localbroadcastmanager:${Versions.AndroidX.localbroadcastmanager}"

    const val google_material = "com.google.android.material:material:${Versions.material}"
    const val google_nearby = "com.google.android.gms:play-services-nearby:${Versions.nearby}"

    const val tools_dokka = "org.jetbrains.dokka:dokka-android-gradle-plugin:${Versions.dokka}"
    const val tools_androidgradle = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    const val tools_kotlingradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val tools_androidmavenpublish = "digital.wup:android-maven-publish:${Versions.android_maven_publish_plugin}"

    const val tools_lint = "com.android.tools.lint:lint:${Versions.lint}"
    const val tools_lintapi = "com.android.tools.lint:lint-api:${Versions.lint}"
    const val tools_linttests = "com.android.tools.lint:lint-tests:${Versions.lint}"

    const val tools_detekt_api = "io.gitlab.arturbosch.detekt:detekt-api:${Versions.detekt}"
    const val tools_detekt_test = "io.gitlab.arturbosch.detekt:detekt-test:${Versions.detekt}"

    const val mozilla_fxa = "org.mozilla.appservices:fxaclient:${Versions.mozilla_appservices}"

    const val mozilla_glean_forUnitTests = "org.mozilla.telemetry:glean-forUnitTests:${Versions.mozilla_glean}"

    const val mozilla_sync_logins = "org.mozilla.appservices:logins:${Versions.mozilla_appservices}"
    const val mozilla_places = "org.mozilla.appservices:places:${Versions.mozilla_appservices}"
    const val mozilla_sync_manager = "org.mozilla.appservices:syncmanager:${Versions.mozilla_appservices}"

    const val mozilla_push = "org.mozilla.appservices:push:${Versions.mozilla_appservices}"

    const val mozilla_remote_tabs = "org.mozilla.appservices:tabs:${Versions.mozilla_appservices}"

    const val mozilla_httpconfig = "org.mozilla.appservices:httpconfig:${Versions.mozilla_appservices}"
    const val mozilla_full_megazord = "org.mozilla.appservices:full-megazord:${Versions.mozilla_appservices}"
    const val mozilla_full_megazord_forUnitTests = "org.mozilla.appservices:full-megazord-forUnitTests:${Versions.mozilla_appservices}"

    const val mozilla_rustlog = "org.mozilla.appservices:rustlog:${Versions.mozilla_appservices}"
    const val mozilla_sync15 = "org.mozilla.appservices:sync15:${Versions.mozilla_appservices}"

    const val thirdparty_okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val thirdparty_okhttp_urlconnection = "com.squareup.okhttp3:okhttp-urlconnection:${Versions.okhttp}"
    const val thirdparty_sentry = "io.sentry:sentry-android:${Versions.sentry}"
    const val thirdparty_zxing = "com.google.zxing:core:${Versions.zxing}"
    const val thirdparty_jna = "net.java.dev.jna:jna:${Versions.jna}@jar"
    const val thirdparty_disklrucache = "com.jakewharton:disklrucache:${Versions.disklrucache}"

    const val firebase_core = "com.google.firebase:firebase-core:${Versions.Firebase.core}"
    const val firebase_messaging = "com.google.firebase:firebase-messaging:${Versions.Firebase.messaging}"
}
