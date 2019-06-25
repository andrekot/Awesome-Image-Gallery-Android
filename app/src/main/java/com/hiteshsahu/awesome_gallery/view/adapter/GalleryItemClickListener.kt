package com.hiteshsahu.awesome_gallery.view.adapter

/**
 * Listener for kitten click events in the grid of kittens
 *
 * @author bherbst
 */
interface GalleryItemClickListener {
    /**
     * Called when a kitten is clicked
     *
     * @param holder   The ViewHolder for the clicked kitten
     * @param position The position in the grid of the kitten that was clicked
     */
    fun onItemSelected(holder: MediaViewHolder, position: Int)
}
