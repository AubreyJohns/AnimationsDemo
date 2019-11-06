package com.sriyank.animationsdemo

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_property_animator_xml.*


class PropertyAnimatorCode : AppCompatActivity(), Animator.AnimatorListener {

	private var rotateAnimator: ObjectAnimator? = null
	private var translateAnimator: ObjectAnimator? = null
	private var scaleAnimator: ObjectAnimator? = null
	private var fadeAnimator: ObjectAnimator? = null

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_property_animator_xml)

	}

	fun rotateAnimation(view: View) {

		rotateAnimator = ObjectAnimator.ofFloat(targetImage, "rotation", 0.0f, -180.0f)
		rotateAnimator?.apply {
			duration = 1000
			repeatCount = 1
			repeatMode = ValueAnimator.REVERSE
			addListener(this@PropertyAnimatorCode)
			start()
		}
	}

	fun scaleAnimation(view: View) {

		scaleAnimator = ObjectAnimator.ofFloat(targetImage, "scaleX", 1.0f, 3.0f)
		scaleAnimator?.apply {
			duration = 1000
			repeatCount = 1
			repeatMode = ValueAnimator.REVERSE
			addListener(this@PropertyAnimatorCode)
			start()
		}
	}

	fun translateAnimation(view: View) {

		translateAnimator = ObjectAnimator.ofFloat(targetImage, "translationX", 0f, 200f)
		translateAnimator?.apply {
			duration = 1000
			repeatCount = 1
			repeatMode = ValueAnimator.REVERSE
			addListener(this@PropertyAnimatorCode)
			start()
		}

		// translateAnimator.cancel()
	}

	fun fadeAnimation(view: View) {

		fadeAnimator = ObjectAnimator.ofFloat(targetImage, "alpha", 1.0f, 0.0f)
		fadeAnimator?.apply {
			duration = 1500
			repeatCount = 1
			repeatMode = ValueAnimator.REVERSE
			addListener(this@PropertyAnimatorCode)
			start()
		}
	}

	// Implementation of AnimatorListener interface
	override fun onAnimationStart(animation: Animator?) {
		if (animation == rotateAnimator)
			Toast.makeText(this, "Rotate Animation Started", Toast.LENGTH_SHORT).show()

		if (animation == scaleAnimator)
			Toast.makeText(this, "Scale Animation Started", Toast.LENGTH_SHORT).show()

		if (animation == translateAnimator)
			Toast.makeText(this, "Translate Animation Started", Toast.LENGTH_SHORT).show()

		if (animation == fadeAnimator)
			Toast.makeText(this, "Fade Animation Started", Toast.LENGTH_SHORT).show()
	}

	override fun onAnimationRepeat(animation: Animator?) {
		if (animation == rotateAnimator)
			Toast.makeText(this, "Rotate Animation Repeated", Toast.LENGTH_SHORT).show()

		if (animation == scaleAnimator)
			Toast.makeText(this, "Scale Animation Repeated", Toast.LENGTH_SHORT).show()

		if (animation == translateAnimator)
			Toast.makeText(this, "Translate Animation Repeated", Toast.LENGTH_SHORT).show()

		if (animation == fadeAnimator)
			Toast.makeText(this, "Fade Animation Repeated", Toast.LENGTH_SHORT).show()
	}

	override fun onAnimationEnd(animation: Animator?) {
		if (animation == rotateAnimator)
			Toast.makeText(this, "Rotate Animation Ended", Toast.LENGTH_SHORT).show()

		if (animation == scaleAnimator)
			Toast.makeText(this, "Scale Animation Ended", Toast.LENGTH_SHORT).show()

		if (animation == translateAnimator)
			Toast.makeText(this, "Translate Animation Ended", Toast.LENGTH_SHORT).show()

		if (animation == fadeAnimator)
			Toast.makeText(this, "Fade Animation Ended", Toast.LENGTH_SHORT).show()
	}

	override fun onAnimationCancel(animation: Animator?) {
		if (animation == rotateAnimator)
			Toast.makeText(this, "Rotate Animation Cancelled", Toast.LENGTH_SHORT).show()

		if (animation == scaleAnimator)
			Toast.makeText(this, "Scale Animation Cancelled", Toast.LENGTH_SHORT).show()

		if (animation == translateAnimator)
			Toast.makeText(this, "Translate Animation Cancelled", Toast.LENGTH_SHORT).show()

		if (animation == fadeAnimator)
			Toast.makeText(this, "Fade Animation Cancelled", Toast.LENGTH_SHORT).show()
	}
}
