package dependencies

const val COMPILE_SDK = 29
const val MIN_SDK = 21
const val TARGET_SDK = 29

private const val VKOTLIN = "1.3.50"
const val KTLINT = "0.24.0"

const val ANDROID_PLUGIN = "com.android.tools.build:gradle:3.5.1"
const val KOTLIN_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:$VKOTLIN"
const val DOKKA_PLUGIN = "org.jetbrains.dokka:dokka-android-gradle-plugin:0.9.16"
const val JETIFIER_PLUGIN = "com.android.tools.build.jetifier:jetifier-processor:1.0.0-beta02"
const val VERSIONS_PLUGIN = "com.github.ben-manes:gradle-versions-plugin:0.20.0"

const val VCOUROUTINE = "1.0.0"
const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib:$VKOTLIN"
const val COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$VCOUROUTINE"
const val UI_COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$VCOUROUTINE"

const val KTX = "androidx.core:core-ktx:1.0.0"

const val MOTIF = "com.uber.motif:motif:0.0.7"
const val MOTIF_COMPILER = "com.uber.motif:motif-compiler:0.0.7"

const val APPCOMPAT = "androidx.appcompat:appcompat:1.0.0"
const val RECYCLERVIEW = "androidx.recyclerview:recyclerview:1.0.0"
const val CONSTRAINTLAYOUT = "androidx.constraintlayout:constraintlayout:2.0.0-beta2"

const val MATERIAL = "com.google.android.material:material:1.0.0"

const val VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.0.0"
const val LIVEDATA = "androidx.lifecycle:lifecycle-livedata:2.0.0"
const val LIFECYCLE_COMPILER = "androidx.lifecycle:lifecycle-compiler:2.0.0"

const val RXJAVA = "io.reactivex.rxjava2:rxjava:2.2.0"
const val RXANDROID = "io.reactivex.rxjava2:rxandroid:2.1.0"

const val GROUPIE = "com.xwray:groupie:2.1.0"
const val GROUPIE_DATABINDING = "com.xwray:groupie-databinding:2.1.0"

private const val VDAGGER = "2.25.2"
const val DAGGER = "com.google.dagger:dagger:$VDAGGER"
const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:$VDAGGER"
const val DAGGER_ANDROID = "com.google.dagger:dagger-android:$VDAGGER"
const val DAGGER_ANDROID_PROCESSOR = "com.google.dagger:dagger-android-processor:$VDAGGER"
const val DAGGER_ANDROID_SUPPORT = "com.google.dagger:dagger-android-support:$VDAGGER"

private const val VDAGGER_REFLECT = "0.1.0"
const val DAGGER_REFLECT = "com.jakewharton.dagger:dagger-reflect:$VDAGGER_REFLECT"
const val DAGGER_REFLECT_CODEGEN = "com.jakewharton.dagger:dagger-codegen:$VDAGGER_REFLECT"

const val OKHTTP = "com.squareup.okhttp3:okhttp:4.0.0"

const val JUNIT = "junit:junit:4.12"
const val TRUTH = "com.google.truth:truth:0.39"
const val MOCKITO_KOTLIN = "com.nhaarman:mockito-kotlin-kt1.1:1.5.0"
const val TEST_RUNNER = "androidx.test:runner:1.1.0"
const val ESPRESSO = "androidx.test.espresso:espresso-core:3.1.0"
