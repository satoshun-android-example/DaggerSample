object Vers {
  const val compile_sdk = 28
  const val min_sdk = 21
  const val target_sdk = 28

  const val kotlin = "1.3.21"
  const val couroutine = "1.0.0"
  const val ktlint = "0.24.0"
}

object Libs {
  val android_plugin = "com.android.tools.build:gradle:3.3.1"
  val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Vers.kotlin}"
  val dokka_plugin = "org.jetbrains.dokka:dokka-android-gradle-plugin:0.9.16"
  val jetifier_plugin = "com.android.tools.build.jetifier:jetifier-processor:1.0.0-beta02"
  val versions_plugin = "com.github.ben-manes:gradle-versions-plugin:0.20.0"

  val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"
  val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Vers.couroutine}"
  val ui_coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Vers.couroutine}"

  val ktx = "androidx.core:core-ktx:1.0.0"

  val motif = "com.uber.motif:motif:0.0.7"
  val motif_compiler = "com.uber.motif:motif-compiler:0.0.7"

  val appcompat = "androidx.appcompat:appcompat:1.0.0"
  val recyclerview = "androidx.recyclerview:recyclerview:1.0.0"
  val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.0-alpha2"

  val material = "com.google.android.material:material:1.0.0"

  val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.0.0"
  val livedata = "androidx.lifecycle:lifecycle-livedata:2.0.0"
  val lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:2.0.0"

  val rxjava = "io.reactivex.rxjava2:rxjava:2.2.0"
  val rxandroid = "io.reactivex.rxjava2:rxandroid:2.1.0"

  val groupie = "com.xwray:groupie:2.1.0"
  val groupie_databinding = "com.xwray:groupie-databinding:2.1.0"

  private const val daggerVer = "2.19"
  val dagger = "com.google.dagger:dagger:$daggerVer"
  val dagger_compiler = "com.google.dagger:dagger-compiler:$daggerVer"
  val dagger_android = "com.google.dagger:dagger-android:$daggerVer"
  val dagger_android_processor = "com.google.dagger:dagger-android-processor:$daggerVer"
  val dagger_android_support = "com.google.dagger:dagger-android-support:$daggerVer"

  val junit = "junit:junit:4.12"
  val truth = "com.google.truth:truth:0.39"
  val mockito_kotlin = "com.nhaarman:mockito-kotlin-kt1.1:1.5.0"
  val test_runner = "androidx.test:runner:1.1.0"
  val espresso = "androidx.test.espresso:espresso-core:3.1.0"
}
