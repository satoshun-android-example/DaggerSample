package dependencies

const val COMPILE_SDK = 30
const val MIN_SDK = 21
const val TARGET_SDK = 30

private const val VKOTLIN = "1.4.21"
const val KTLINT = "0.24.0"

const val ANDROID_PLUGIN = "com.android.tools.build:gradle:4.1.2"
const val KOTLIN_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:$VKOTLIN"
const val VERSIONS_PLUGIN = "com.github.ben-manes:gradle-versions-plugin:0.20.0"

const val VCOUROUTINE = "1.4.2"
const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib:$VKOTLIN"
const val COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$VCOUROUTINE"

const val KTX = "androidx.core:core-ktx:1.3.2"

const val MOTIF = "com.uber.motif:motif:0.0.7"
const val MOTIF_COMPILER = "com.uber.motif:motif-compiler:0.0.7"

const val APPCOMPAT = "androidx.appcompat:appcompat:1.1.0"
const val RECYCLERVIEW = "androidx.recyclerview:recyclerview:1.1.0"
const val CONSTRAINTLAYOUT = "androidx.constraintlayout:constraintlayout:2.0.0-beta3"

const val ACTIVITYX = "androidx.activity:activity-ktx:1.1.0"
const val FRAGMENTX = "androidx.fragment:fragment-ktx:1.2.0"

const val MATERIAL = "com.google.android.material:material:1.1.0"

const val VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
const val VIEWMODEL_SAVEDSTATE = "androidx.lifecycle:lifecycle-viewmodel-savedstate:2.2.0"
const val LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0"
const val LIFECYCLE = "androidx.lifecycle:lifecycle-runtime-ktx:2.2.0"

private const val VDAGGER = "2.31.2"
const val DAGGER = "com.google.dagger:dagger:$VDAGGER"
const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:$VDAGGER"
const val DAGGER_ANDROID = "com.google.dagger:dagger-android:$VDAGGER"
const val DAGGER_ANDROID_PROCESSOR = "com.google.dagger:dagger-android-processor:$VDAGGER"
const val DAGGER_ANDROID_SUPPORT = "com.google.dagger:dagger-android-support:$VDAGGER"

private const val VDAGGER_HILT = "2.31.2-alpha"
const val DAGGER_HILT_PLUGIN = "com.google.dagger:hilt-android-gradle-plugin:$VDAGGER_HILT"
const val DAGGER_HILT = "com.google.dagger:hilt-android:$VDAGGER_HILT"
const val DAGGER_HILT_COMPILER = "com.google.dagger:hilt-android-compiler:$VDAGGER_HILT"

private const val VDAGGER_HILT_ANDROIDX = "1.0.0-alpha02"
const val DAGGER_HILT_ANDROIDX_COMPILER = "androidx.hilt:hilt-compiler:$VDAGGER_HILT_ANDROIDX"
const val DAGGER_HILT_VIEWMODEL = "androidx.hilt:hilt-lifecycle-viewmodel:$VDAGGER_HILT_ANDROIDX"

private const val VDAGGER_REFLECT = "0.1.0"
const val DAGGER_REFLECT = "com.jakewharton.dagger:dagger-reflect:$VDAGGER_REFLECT"
const val DAGGER_REFLECT_CODEGEN = "com.jakewharton.dagger:dagger-codegen:$VDAGGER_REFLECT"

const val OKHTTP = "com.squareup.okhttp3:okhttp:4.0.0"

const val JUNIT = "junit:junit:4.12"
const val TRUTH = "com.google.truth:truth:0.39"
const val MOCKITO_KOTLIN = "com.nhaarman:mockito-kotlin-kt1.1:1.5.0"
const val TEST_RUNNER = "androidx.test:runner:1.1.0"
const val ESPRESSO = "androidx.test.espresso:espresso-core:3.1.0"
