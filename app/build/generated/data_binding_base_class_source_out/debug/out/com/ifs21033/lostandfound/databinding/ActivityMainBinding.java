// Generated by view binder compiler. Do not edit!
package com.ifs21033.lostandfound.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ifs21033.lostandfound.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appbarLayoutMain;

  @NonNull
  public final MaterialToolbar appbarMain;

  @NonNull
  public final FloatingActionButton fabMainAddLostFound;

  @NonNull
  public final ProgressBar pbMain;

  @NonNull
  public final RecyclerView rvMainLostFounds;

  @NonNull
  public final SearchView svMain;

  @NonNull
  public final TextView tvMainEmptyError;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppBarLayout appbarLayoutMain, @NonNull MaterialToolbar appbarMain,
      @NonNull FloatingActionButton fabMainAddLostFound, @NonNull ProgressBar pbMain,
      @NonNull RecyclerView rvMainLostFounds, @NonNull SearchView svMain,
      @NonNull TextView tvMainEmptyError) {
    this.rootView = rootView;
    this.appbarLayoutMain = appbarLayoutMain;
    this.appbarMain = appbarMain;
    this.fabMainAddLostFound = fabMainAddLostFound;
    this.pbMain = pbMain;
    this.rvMainLostFounds = rvMainLostFounds;
    this.svMain = svMain;
    this.tvMainEmptyError = tvMainEmptyError;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbarLayoutMain;
      AppBarLayout appbarLayoutMain = ViewBindings.findChildViewById(rootView, id);
      if (appbarLayoutMain == null) {
        break missingId;
      }

      id = R.id.appbarMain;
      MaterialToolbar appbarMain = ViewBindings.findChildViewById(rootView, id);
      if (appbarMain == null) {
        break missingId;
      }

      id = R.id.fabMainAddLostFound;
      FloatingActionButton fabMainAddLostFound = ViewBindings.findChildViewById(rootView, id);
      if (fabMainAddLostFound == null) {
        break missingId;
      }

      id = R.id.pbMain;
      ProgressBar pbMain = ViewBindings.findChildViewById(rootView, id);
      if (pbMain == null) {
        break missingId;
      }

      id = R.id.rvMainLostFounds;
      RecyclerView rvMainLostFounds = ViewBindings.findChildViewById(rootView, id);
      if (rvMainLostFounds == null) {
        break missingId;
      }

      id = R.id.svMain;
      SearchView svMain = ViewBindings.findChildViewById(rootView, id);
      if (svMain == null) {
        break missingId;
      }

      id = R.id.tvMainEmptyError;
      TextView tvMainEmptyError = ViewBindings.findChildViewById(rootView, id);
      if (tvMainEmptyError == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, appbarLayoutMain, appbarMain,
          fabMainAddLostFound, pbMain, rvMainLostFounds, svMain, tvMainEmptyError);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
