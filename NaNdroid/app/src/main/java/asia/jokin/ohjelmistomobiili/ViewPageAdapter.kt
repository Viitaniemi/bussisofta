package asia.jokin.ohjelmistomobiili

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter internal constructor(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val COUNT = 3 // fragmenttien/sivujen maara

    override fun getItem(position: Int): Fragment? {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = FavouritesFragment()
            1 -> fragment = StopsFragment()
            2 -> fragment = LinesFragment()
        }

        return fragment
    }

    override fun getCount(): Int {
        return COUNT
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        when (position) {
            0 -> title = "Favourites"
            1 -> title = "Stops"
            2 -> title = "Lines"
        }
        return title
    }
}