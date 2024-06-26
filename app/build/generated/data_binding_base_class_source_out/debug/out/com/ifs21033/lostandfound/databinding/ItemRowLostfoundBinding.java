// Generated by view binder compiler. Do not edit!
package com.ifs21033.lostandfound.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ifs21033.lostandfound.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRowLostfoundBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CheckBox cbItemLostFoundIsFinished;

  @NonNull
  public final ImageView ivItemLostFoundDetail;

  @NonNull
  public final TextView tvItemLostFoundTitle;

  @NonNull
  public final TextView tvLostFoundDetailStatus;

  private ItemRowLostfoundBinding(@NonNull CardView rootView,
      @NonNull CheckBox cbItemLostFoundIsFinished, @NonNull ImageView ivItemLostFoundDetail,
      @NonNull TextView tvItemLostFoundTitle, @NonNull TextView tvLostFoundDetailStatus) {
    this.rootView = rootView;
    this.cbItemLostFoundIsFinished = cbItemLostFoundIsFinished;
    this.ivItemLostFoundDetail = ivItemLostFoundDetail;
    this.tvItemLostFoundTitle = tvItemLostFoundTitle;
    this.tvLostFoundDetailStatus = tvLostFoundDetailStatus;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRowLostfoundBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRowLostfoundBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_row_lostfound, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRowLostfoundBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cbItemLostFoundIsFinished;
      CheckBox cbItemLostFoundIsFinished = ViewBindings.findChildViewById(rootView, id);
      if (cbItemLostFoundIsFinished == null) {
        break missingId;
      }

      id = R.id.ivItemLostFoundDetail;
      ImageView ivItemLostFoundDetail = ViewBindings.findChildViewById(rootView, id);
      if (ivItemLostFoundDetail == null) {
        break missingId;
      }

      id = R.id.tvItemLostFoundTitle;
      TextView tvItemLostFoundTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvItemLostFoundTitle == null) {
        break missingId;
      }

      id = R.id.tvLostFoundDetailStatus;
      TextView tvLostFoundDetailStatus = ViewBindings.findChildViewById(rootView, id);
      if (tvLostFoundDetailStatus == null) {
        break missingId;
      }

      return new ItemRowLostfoundBinding((CardView) rootView, cbItemLostFoundIsFinished,
          ivItemLostFoundDetail, tvItemLostFoundTitle, tvLostFoundDetailStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
