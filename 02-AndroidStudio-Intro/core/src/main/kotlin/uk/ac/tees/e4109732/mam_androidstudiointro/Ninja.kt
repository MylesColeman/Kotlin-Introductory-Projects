package uk.ac.tees.e4109732.mam_androidstudiointro

import ktx.assets.toInternalFile
import com.badlogic.gdx.utils.Disposable
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
import ktx.assets.disposeSafely

class Ninja(initX: Float, initY: Float) : Disposable {
    val ninjaImage = Texture("ninja.png".toInternalFile(), true).apply { setFilter( Linear, Linear) }

    var x = initX
        private set

    var y = initY
        private set

    fun update(delta: Float) {
        x += SPEED_X * delta
    }

    override fun dispose() = ninjaImage.disposeSafely()

    companion object {
        const val SPEED_X = 50f
    }
}
