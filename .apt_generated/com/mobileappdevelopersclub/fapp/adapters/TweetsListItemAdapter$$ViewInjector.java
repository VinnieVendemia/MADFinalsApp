// Generated code from Butter Knife. Do not modify!
package com.mobileappdevelopersclub.fapp.adapters;

import android.view.View;
import butterknife.Views.Finder;

public class TweetsListItemAdapter$$ViewInjector {
  public static void inject(Finder finder, final com.mobileappdevelopersclub.fapp.adapters.TweetsListItemAdapter target, Object source) {
    View view;
    view = finder.findById(source, 2131296299);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131296299' for field 'tweetText' was not found. If this field binding is optional add '@Optional'.");
    }
    target.tweetText = (android.widget.TextView) view;
    view = finder.findById(source, 2131296298);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131296298' for field 'tweetUsername' was not found. If this field binding is optional add '@Optional'.");
    }
    target.tweetUsername = (android.widget.TextView) view;
    view = finder.findById(source, 2131296300);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131296300' for field 'tweetHashtags' was not found. If this field binding is optional add '@Optional'.");
    }
    target.tweetHashtags = (android.widget.TextView) view;
    view = finder.findById(source, 2131296297);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131296297' for field 'tweetImage' was not found. If this field binding is optional add '@Optional'.");
    }
    target.tweetImage = (android.widget.ImageView) view;
  }

  public static void reset(com.mobileappdevelopersclub.fapp.adapters.TweetsListItemAdapter target) {
    target.tweetText = null;
    target.tweetUsername = null;
    target.tweetHashtags = null;
    target.tweetImage = null;
  }
}
