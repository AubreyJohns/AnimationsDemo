package com.sriyank.animationsdemo

import android.animation.Animator
import android.animation.AnimatorInflater
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class AnimatorListenerActivity : AppCompatActivity(), Animator.AnimatorListener {

	private var rotateAnimator: Animator? = null
	private var scaleAnimator: Animator? = null
	private var translateAnimator: Animator? = null
	private var fadeAnimator: Animator? = null

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_animator_listener)

	}

	fun rotateAnimation(view: View) {

		rotateAnimator = AnimatorInflater.loadAnimator(this, R.animator.rotate)
		rotateAnimator?.apply {
			setTarget(targetImage)
			addListener(this@AnimatorListenerActivity)
			start()
		}
	}

	fun scaleAnimation(view: View) {

		scaleAnimator = AnimatorInflater.loadAnimator(this, R.animator.scale)
		scaleAnimator?.apply {
			setTarget(targetImage)
			addListener(this@AnimatorListenerActivity)
			start()
		}
	}

	fun translateAnimation(view: View) {

		translateAnimator = AnimatorInflater.loadAnimator(this, R.animator.translate)
		translateAnimator?.apply {
			setTarget(targetImage)
			addListener(this@AnimatorListenerActivity)
			start()
		}
	}

	fun fadeAnimation(view: View) {

		fadeAnimator = AnimatorInflater.loadAnimator(this, R.animator.alpha)
		fadeAnimator?.apply {
			setTarget(targetImage)
			addListener(this@AnimatorListenerActivity)
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
